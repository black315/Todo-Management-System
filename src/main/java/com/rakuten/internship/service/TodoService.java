package com.rakuten.internship.service;

import java.util.List;

import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * このクラスは、データベースとのトランザクションをサポートするサービスクラスです。。
 */
@Service
@Transactional
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    /**
     * Todoを全件取得します
     * @return Todo一覧
     */
    public List<Todo> findTodos(){
        return todoRepository.findAll();
    }

    /**
     * Todoを保存します
     * @param todo Todo
     * @return 保存したTodo
     */
    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }
}
