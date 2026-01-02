<?php

$host = "127.0.0.1";
$user = "root";
$pass = "rootpass";
$db   = "mydb";

$conn = new mysqli($host, $user, $pass, $db);
$limit = isset($_GET['limit']) ? $_GET['limit'] : 10;
$sql = "SELECT * FROM products LIMIT $limit";
$result = $conn->query($sql);

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Products</title>
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <header class="site-header">
        <div>
            <h1>Product Catalog</h1>
            <div class="muted">Showing up products</div>
        </div>

        <form class="controls" method="get" action="">
            <label for="limit" class="muted">Limit</label>
            <input id="limit" name="limit" type="number" min="1" max="100" value="<?= htmlspecialchars($limit) ?>">
            <button type="submit" class="btn btn-apply">Apply</button>
        </form>
    </header>

    <main class="container">
        <div class="grid">
            <?php if ($result && $result->num_rows > 0): ?>
                <?php while($row = $result->fetch_assoc()): ?>
                    <?php
                        $id = (int)$row['id'];
                        $name = htmlspecialchars($row['name']);
                        $price = number_format((float)$row['price'], 2);
                        $desc = nl2br(htmlspecialchars($row['description'] ?? ''));
                    ?>
                    <article class="card" aria-labelledby="product-<?= $id ?>">
                        <div class="thumb">
                            <svg class="placeholder" width="60" height="60" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg" aria-hidden="true">
                                <rect width="24" height="24" rx="4" fill="#eef2ff"/>
                                <path d="M7 14l3-4 2 3 3-5 2 4" stroke="#2563eb" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/>
                            </svg>
                        </div>

                        <div class="meta">
                            <div id="product-<?= $id ?>" class="name"><?= $name ?></div>
                            <div class="price">$<?= $price ?></div>
                        </div>

                        <div class="desc"><?= $desc ?></div>

                    </article>
                <?php endwhile; ?>
            <?php else: ?>
                <div class="no-products">No products found.</div>
            <?php endif; ?>
        </div>
    </main>

</body>
</html>
<?php
$conn->close();
?>
