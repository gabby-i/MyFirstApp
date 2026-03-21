package ru.martuanov.menu.viewmodel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ru.martuanov.menu.dto.Post
import ru.martuanov.menu.repository.PostRepository
import ru.martuanov.menu.repository.PostRepositoryInMemoryImpl

class PostViewModel : ViewModel() {

    private val repository: PostRepository = PostRepositoryInMemoryImpl()

    val data: LiveData<List<Post>> = repository.getAll()

    fun likeById(id: Long) = repository.likeById(id)

    fun shareById(id: Long) = repository.shareById(id)

    fun increaseViews(id: Long) = repository.increaseViews(id)
}


