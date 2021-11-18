package composite.patron;

/**
 * @author fobregon
 * 
 * El patron de diseño Composite nos sirve para construir estructuras complejas partiendo de otras mucho mas simples; 
 * dicho de otra manera, 
 * podemos crear estructuras compuestas que estan conformadas por otras estructuras mas pequeÃ±as.
 */
public class CompositeTest {

    public static void main(String[] args) {

        Component componentOne = new Composite("Composite One");
        Component componentTwo = new Composite("Composite Two");
        Component componentThree = new Composite("Composite Three");

        Component componentWrapper = new Composite("All components");

        componentWrapper.add(componentOne);
        componentWrapper.add(componentTwo);
        componentWrapper.add(componentThree);

        componentOne.add(new Leaf("ONE: Sub component one"));
        componentOne.add(new Leaf("ONE: Sub component two"));
        componentOne.add(new Leaf("ONE: Sub component three"));

        componentTwo.add(new Leaf("TWO: Sub component one"));
        componentTwo.add(new Leaf("TWO: Sub component two"));

        componentThree.add(new Leaf("THREE: Sub component one"));
        componentThree.add(new Leaf("THREE: Sub component two"));
        componentThree.add(new Leaf("THREE: Sub component three"));
        componentThree.add(new Leaf("THREE: Sub component four"));

        componentWrapper.doSomething();

    }

}
