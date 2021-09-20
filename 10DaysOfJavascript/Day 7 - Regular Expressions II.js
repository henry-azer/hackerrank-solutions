function regexVar() {
    /*
     * Declare a RegExp object variable named 're'
     * It must match a string that starts with 'Mr.', 'Mrs.', 'Ms.', 'Dr.', or 'Er.',
     * followed by one or more letters.
     */
    /*
     * Do not remove the return statement
     */
    return /^(Mr|Mrs|Ms|Dr|Er)(\.)([a-zA-Z])+$/;
}

function main() {
    const re = regexVar();
    const s = readLine();

    console.log(!!s.match(re));
}
