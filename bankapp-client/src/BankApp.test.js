import React from "react";
import BankApp from "./BankApp";
import { render } from "@testing-library/react";
import "@testing-library/jest-dom/extend-expect";

describe("Testing BankApp Component", () => {
  test("should say hello this is BankApp", () => {
    const text = "BankApp";
    const hello = render(<BankApp />);
    expect(hello.getByText("Hello", { exact: false })).not.toHaveTextContent(
      "Chandy"
    );
    expect(hello.getByText("Hello", { exact: false })).toHaveTextContent(text);
  });
});
