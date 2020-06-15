package cn.htl.bootlaunch.controller;

import cn.htl.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Article hello() {
        Article article =Article.builder().id(3L).author("莫言").build();
        log.info("测试一下"+article);

        return article ;
    }
}