package pl.edu.wszib.design_patterns.composite;

import lombok.Value;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Value
public class Menu implements MenuItem {
    String title;
    List<MenuItem> items;

    public static Menu of(String title, MenuItem... items) {
        return new Menu(title, items);
    }

    private Menu(String title, MenuItem... items) {
        this.title = title;
        this.items = List.of(items);
    }

    @Override
    public void draw(int indentation) {
        System.out.print(StringUtils.repeat(" ", indentation));
        System.out.println(title);
        items.forEach(menuItem -> menuItem.draw(indentation + 1));
    }
}
