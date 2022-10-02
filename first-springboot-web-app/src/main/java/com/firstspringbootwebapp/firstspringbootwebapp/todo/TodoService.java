package com.firstspringbootwebapp.firstspringbootwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	private static int todoCounter = 0;
	static {
		todos.add(new Todo(++todoCounter, "to learn Spring Boot", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCounter, "to complete Azure", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todoCounter, "to complete FullStack", LocalDate.now().plusYears(3), false));
	}

	public List<Todo> findByUserName(String userName) {
		return todos;
	}

	public void addTodos(String description) {
		todos.add(new Todo(++todoCounter, description, LocalDate.now().plusYears(1), false));
	}

	public void deleteTodoById(int id) {

		Predicate<Todo> removeIf = todo -> todo.getId() == id;
		todos.removeIf(removeIf);
	}

	public Todo findById(int id) {
		Predicate<Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}
}
