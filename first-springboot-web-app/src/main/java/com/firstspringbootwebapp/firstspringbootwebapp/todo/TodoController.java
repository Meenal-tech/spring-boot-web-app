package com.firstspringbootwebapp.firstspringbootwebapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

	@Autowired
	TodoService todoService;

	@RequestMapping(value = "/list-todo", method = RequestMethod.GET)
	public String populateTodoList(ModelMap model) {
		model.put("todos", todoService.findByUserName("dummy"));
		return "todoList";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showNewTodoPage() {
		return "todo";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addNewTodo(@RequestParam String description) {
		todoService.addTodos(description);
		return "redirect:list-todo"; // redirecting it to an specific url.
	}

	@RequestMapping(value = "/delete-todo")
	public String deleteTodo(@RequestParam int id) {
		todoService.deleteTodoById(id);
		return "redirect:list-todo";
	}

	@RequestMapping("/update-todo")
	public String updateToDo(@RequestParam int id) {
		todoService.findById(id);
		return "todoList";
	}

}
