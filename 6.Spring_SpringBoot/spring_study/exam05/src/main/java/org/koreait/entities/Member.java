package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.koreait.constants.Role;

import java.time.LocalDateTime;
import java.util.Date;

@Entity // 클래스를 엔티티로 선언 -> JPA에서 관리, 테이블에 대응하는 클래스
@Table(name="es_member")
@Data @Builder
@AllArgsConstructor @NoArgsConstructor

public class Member {
    @Id @GeneratedValue
    private Long userNo;

    @Column(name="memId", length=40, unique = true, nullable = false)
    private String userId;

    @Column(length = 65, nullable = false)
    private String userPw;

    @Column(length=40, nullable=false)
    private String userNm;

    @Transient
    private String introduction;

    @Enumerated(EnumType.STRING) // enum 함수
    private Role role;

    @CreationTimestamp
    private LocalDateTime regDt;

    @UpdateTimestamp
    private LocalDateTime modDt;

    /**
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    */

}