package cn.htl.bootlaunch.model;


import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder(value = {"content","title"}) 注解作用：改变json子元素的顺序
public class Article {


    /**
     * id : 1
     * author : zimug
     * title : 手摸手教你开发spring boot
     * content : c
     * createTime :
     * reader : [{"name":"zimug","age":18},{"name":"kobe","age":37}]
     */
    //@JsonIgnore 起到排除属性不做序列化作用 在这对id不做
    private Long id;
    //@JsonProperty("auther")//为属性换名
    private String author;
    private String title;
    //@JsonInclude(JsonInclude.Include.NON_NULL) 排除为空的元素不做序列化反序列化
    private String content;
    //@JsonFormat(pattern = "yyyy-MM-dd HHmmss",timezone = "GMT+8") //指定属性格式
    private String createTime;
    private List<Reader> reader;

}
