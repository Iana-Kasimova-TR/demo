package com.example.simplyCook.service;

import com.example.simplyCook.Client.SimplyCookClient;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class SimplyCookService {
  private final SimplyCookClient simplyCookClient;
}
