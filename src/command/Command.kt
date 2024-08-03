package command

interface Command {
    // 커맨드 객체는 모두 같은 인터페이스를 구현
    fun execute()
}