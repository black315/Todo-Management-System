package com.rakuten.internship;

import java.util.List;

import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * このクラスは、ウェブアプリケーションの挙動を制御するためのコントローラークラスです。。
 * コントローラーとして使えるように、コードを記入してください。
 */
@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    /**
     * ホーム画面を表示します
     * @param model モデル
     * @return ホーム画面
     */
    @GetMapping("/")
    public String home(Model model) {
        List<Todo> todos = todoService.findTodos();
        model.addAttribute(todos);
        return "home";
    }

    /**
     * 入力フォームを表示します
     * @return 入力フォーム
     */
    @GetMapping("/create")
    public String create() {
        return "create";
    }

    /**
     * 登録して完了画面を表示します
     * @param todo Todo
     * @return 完了画面
     */
    @PostMapping("/create")
    public String createTodo(@ModelAttribute Todo todo) {
        todoService.save(todo);
        return "complete";
    }
}