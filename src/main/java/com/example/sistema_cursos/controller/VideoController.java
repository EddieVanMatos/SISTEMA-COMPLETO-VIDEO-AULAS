package com.example.sistema_cursos.controller;

import com.example.sistema_cursos.model.Video;
import com.example.sistema_cursos.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/videos")
public class VideoController {

    @Autowired
    private VideoService videoService;

    // Retorna todos os vídeos
    @GetMapping
    public List<Video> getAllVideos() {
        return videoService.getAllVideos();
    }

    // Retorna um vídeo específico pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Video> getVideoById(@PathVariable Long id) {
        Optional<Video> video = videoService.getVideoById(id);
        return video.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Adiciona um novo vídeo
    @PostMapping
    public ResponseEntity<Video> saveVideo(@RequestBody Video video) {
        Video savedVideo = videoService.saveVideo(video);
        return ResponseEntity.ok(savedVideo);
    }

    // Atualiza um vídeo existente
    @PutMapping("/{id}")
    public ResponseEntity<Video> updateVideo(@PathVariable Long id, @RequestBody Video videoDetails) {
        Optional<Video> video = videoService.getVideoById(id);
        if (video.isPresent()) {
            Video existingVideo = video.get();
            existingVideo.setId(videoDetails.getNome());
            existingVideo.setUrl(videoDetails.getUrl());
            existingVideo.setDescricao(videoDetails.getDescricao());
            Video updatedVideo = videoService.saveVideo(existingVideo);
            return ResponseEntity.ok(updatedVideo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Deleta um vídeo pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideo(@PathVariable Long id) {
        Optional<Video> video = videoService.getVideoById(id);
        if (video.isPresent()) {
            videoService.deleteVideo(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
