package com.example.movieapplication.screens.FavoriteScreen/*

package com.example.movieapplication

import androidx.activity.viewModels
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import com.example.movieapplication.models.Movie

class FavoritesViewModel : ViewModel() {
    private val _favoriteMovies = mutableStateListOf<Movie>()
    val favoriteMovies: List<Movie>
    get() = _favoriteMovies
    //val favoritesViewModel: FavoritesViewModel by viewModels()
    //favoritesViewModel.favoriteMovies



    fun addMovie(movie: Movie){
        _favoriteMovies.add(movie)
    }
    fun removeMovie(movie: Movie){
        _favoriteMovies.remove(movie)
    }
    fun exists(movie: Movie) {
        _favoriteMovies.any { m -> m.id == movie.id }
    }
    fun getFavorites(): SnapshotStateList<Movie> {
       // for(element in _favoriteMovies){
       //     println(element)
       // }
        return _favoriteMovies
    }
    /*
    fun movieIsFavorite(movie: Movie){
        if(_favoriteMovies.contains(movie)){
            return
        }
        }
       */

    }



 */