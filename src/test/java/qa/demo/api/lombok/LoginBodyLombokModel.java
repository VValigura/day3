package qa.demo.api.lombok;

import lombok.Data;

@Data
public class LoginBodyLombokModel {
    String email, password;
}