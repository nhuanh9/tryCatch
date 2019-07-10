public class notFineException extends Exception {
    public notFineException() {
        super();
    }
    public void getString(){
        System.out.println("Không thỏa mãn điều kiện!");
    }
}
