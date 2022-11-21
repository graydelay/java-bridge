package bridge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.*;

class OutputViewTest {

    OutputView outputView;

    @BeforeEach
    void setUp() {
        outputView = new OutputView();
    }

    @Test
    void isOTrueTest() {
        assertThat(outputView.isO("U", "U", "U")).isTrue();
    }

    @Test
    void isOFalseTest() {
        assertThat(outputView.isO("U", "U", "D")).isFalse();
    }

    @Test
    void isXTrueTest() {
        assertThat(outputView.isX("D", "U", "U")).isTrue();
    }

    @Test
    void isXFalseTest() {
        assertThat(outputView.isX("U", "U", "D")).isFalse();
    }

    @Test
    void printTestU() {
        outputView.printSingleMap(List.of("U", "D", "D"), List.of("U", "U"), "U");
        assertThatNoException();
    }

    @Test
    void printTestD() {
        outputView.printSingleMap(List.of("U", "D", "D"), List.of("U", "U"), "D");
        assertThatNoException();
    }
}