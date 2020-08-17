package com.practice.restful.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok 사용 시 settings -> Build,Execution, Deployment -> Annotation Processors -> Enable Annotation Processing -> Check!
@Data                   // lombok : 생성자, getter, setter, toString과 같은 코드 자동 생성
@AllArgsConstructor     // 모든 생성자를 생성
@NoArgsConstructor      // 기본 생성자만 생성
public class HelloWorldBean {
    private String message;

/*
    @Data => setter, getter 자동 생성
    public String getMessage() {
        return this.message;
    }
    public String setMessage(String message) {
        this.message = message
    }
*/

/*
    @AllArgsConstructor => 생성자 자동 생성
    public HelloWorldBean(String message) {
    }
*/
}
