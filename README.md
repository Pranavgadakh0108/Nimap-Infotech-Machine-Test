# Nimap-Infotech-Machine-Test
Nimap Infotech - Machine Test Java

# Technology Stack:
1. Spring Boot
2. REST Controller
3. JPA & Hibernate
4. RDB (Relational Database) instead of in-memory
5. Annotation-based configuration (No XML)
   
# CRUD Operations for Category:
GET /api/categories?page=3 → Fetch all categories (Paginated)
POST /api/categories → Create a new category
GET /api/categories/{id} → Fetch category by ID
PUT /api/categories/{id} → Update category by ID
DELETE /api/categories/{id} → Delete category by ID

# CRUD Operations for Product:
GET /api/products?page=2 → Fetch all products (Paginated)
POST /api/products → Create a new product
GET /api/products/{id} → Fetch product by ID
PUT /api/products/{id} → Update product by ID
DELETE /api/products/{id} → Delete product by ID

# Additional Requirements:
Category-Product Relationship: One-to-many (One category can have multiple products).
Server-side Pagination: Required for fetching categories and products.
Single Product Response: Should include respective category details.
