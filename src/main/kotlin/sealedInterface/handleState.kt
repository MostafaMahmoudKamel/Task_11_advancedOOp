package sealedInterface

//function handle state
fun <T> handleState(state: State<T>) {
    when (state) {
        is State.Loading -> println("sealedInterface.State is Loading ")
        is State.Success -> println("sealedInterface.State is Success")
        is State.Error -> println("sealedInterface.State has error ${state.message}")
    }
}