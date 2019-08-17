package com.rakuten.internship.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * このクラスは、タスク管理の対象となるTodoのエンティティーです。
 * エンティティーとして使えるように、コードを記入してください。
 */
@Entity
public class Todo {
    
    /** ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    /** タイトル */
    private String title;
  
    /** 説明 */
    private String description;
    
    /**
     * IDを取得します
     * @return ID
     */
    public Long getId() {
        return id;
    }
    
    /**
     * IDをセットします
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * タイトルを取得します
     * @return タイトル
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * タイトルをセットします
     * @param title タイトル
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * 説明を取得します
     * @return 説明
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * 説明をセットします説明をセット
     * @param description 説明
     */
    public void setDescription(String description) {
        this.description = description;
    }
}