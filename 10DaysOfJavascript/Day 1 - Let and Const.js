function main() {
    const PI = 3.14159265358979323846;
    // Write your code here. Read input using 'readLine()' and print output using 'console.log()'.
    let radius = readLine();
    // Print the area of the circle:
    console.log(PI * radius * radius);
    // Print the perimeter of the circle:
    console.log(2 * PI * radius);

    try {
        // Attempt to redefine the value of constant variable PI
        const PI = 0;
        // Attempt to print the value of PI
        console.log(PI);
    } catch (error) {
        console.error("You correctly declared 'PI' as a constant.");
    }
}
