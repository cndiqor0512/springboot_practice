    package com.example.springboot_practice.domain;

    import com.fasterxml.jackson.annotation.JsonFormat;
    import lombok.Data;

    import java.time.LocalDateTime;

    @Data
    public class User {

        private Long id;
        private String name;
        private int age;
        private String birthday;
        private String phone_number;
        private Long address;
        private String type;
        private int is_use;
        private int is_teacher;
        private String student_id;
        private String password;
        private String identification;

        @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
        private LocalDateTime regDate;
    }
