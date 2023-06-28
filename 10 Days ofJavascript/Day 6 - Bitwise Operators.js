function getMaxLessThanK(n, k) {
    let max = 0;
    for (let i = 1; i < n; i++) {
        for (let j = i + 1; j < n + 1; j++) {
            if (Number(i & j) < k && Number(i & j) > max) {
                max = i & j;
            }
        }
    }

    return max;
}

function main() {
    const q = +readLine();

    for (let i = 0; i < q; i++) {
        const [n, k] = readLine().split(" ").map(Number);

        console.log(getMaxLessThanK(n, k));
    }
}
