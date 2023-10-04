package kopo.poly.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@Setter
public class MailDTO {
    private String toMail;   // 받는 사람
    private String title;    // 보내는 메일 제목
    private String contents; // 보내는 메일 내용
    private String mailSeq; // 발송순번
    private String sendTime; // 발송시간
}
