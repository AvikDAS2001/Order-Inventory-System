# Order-Inventory-System
Concept:  Build two microservices:  Order Service: Handles placing, updating, and canceling orders.  Inventory Service: Manages stock and listens for Kafka events from Order Service.  Kafka Use Case: When an order is placed, publish an “order_created” event → Inventory Service consumes and updates stock.
