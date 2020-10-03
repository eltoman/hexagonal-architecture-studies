# hexagonal-architecture-studies
Studies about hexagonal architecture. This architecture is useful when we are designing a domain-driven application

- Domain Object = Product
    - Core application = ProductServiceImplementation
- Ports
    - Inbound Port = ProductService
    -  Outbound Port = ProductRepository
- Adapters
    - Primary Adapters = ProductController
    - Secondary Adapters = ProductRepositoryImplementation
