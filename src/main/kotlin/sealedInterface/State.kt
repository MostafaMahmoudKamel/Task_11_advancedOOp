package sealedInterface

sealed interface State<T> {
    data class Success<T>(var data: T) : State<T>
    data class Error<T>(var message: T) : State<T>
    object Loading : State<Nothing>
}