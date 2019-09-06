import React from "react";
import Hello from "./Hello";
import { render } from "@testing-library/react";
import "@testing-library/jest-dom/extend-expect";

describe("Testing Hello Component", () => {
  test("should say hello to World", () => {
    const obj = "World";
    const hello = render(<Hello object={obj} />);
    expect(hello.getByText("Hello", { exact: false })).not.toHaveTextContent(
      "Chandy"
    );
    expect(hello.getByText("Hello", { exact: false })).toHaveTextContent(obj);
  });
});
