import React from "react";
import BankApp from "./BankApp";
import { render } from "@testing-library/react";
import "@testing-library/jest-dom/extend-expect";

describe("Testing BankApp Component", () => {
  test("should say this is BankApp", () => {
    const text = "BankApp";
    const bankApp = render(<BankApp />);
    expect(bankApp.getByText("Header", { exact: false })).not.toHaveTextContent(
      "Chandy"
    );
    expect(bankApp.getByText("Header", { exact: false })).toHaveTextContent(
      text
    );
  });
});
