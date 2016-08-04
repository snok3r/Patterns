package behavioral.template;

import behavioral.template.impls.HardEquation;
import behavioral.template.impls.SimpleEquation;
import behavioral.template.interfaces.AbstractEquation;

import java.util.Arrays;
import java.util.List;

public class TemplatePattern {
    public static void main(String[] args) {
        List<AbstractEquation> equations = Arrays.asList(
                new SimpleEquation(),
                new HardEquation()
        );
        equations.forEach(AbstractEquation::solve);
    }
}
