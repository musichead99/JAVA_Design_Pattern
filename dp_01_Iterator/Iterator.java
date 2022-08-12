/* 하나씩 나열하면서 검색을 실행하는 인터페이스 */

public interface Iterator {
    public abstract boolean hasNext(); // 다음 요소가 존재하는지를 확인하는 메소드
    public abstract Object next(); // 다음 요소를 불러오는 메소드, 내부 상태를 조정하여 다음 호출 시 그 다음 요소를 불러올 수 있게 함
}
