package pl.edu.wszib.design_patterns.composite;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.apache.commons.lang3.StringUtils;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Button implements MenuItem {
    String title;

    public static Button of(String title) {
        return new Button(title);
    }

    @Override
    public void draw(int indentation) {
        System.out.print(StringUtils.repeat(" ", indentation));
        System.out.println(title);
    }
}
