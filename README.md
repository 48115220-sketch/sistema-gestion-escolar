*Sistema de Gestión Escolar*

Tecnologías

- **Backend**: Java, Spring Boot, Spring Cloud (Eureka Server, API Gateway), Spring Security (JWT).
- **Frontend**: Angular.
- **Base de Datos**: H2 (Persistente en `./data`).
- **Contenedores**: Docker, Docker Compose.

Servicios y Puertos

| Servicio | Puerto |
| `eureka-server` | `8761` |
| `gateway-service` | `8080` | 
| `alumno-service` | `8081` |
| `curso-service` | `8082` |
| `admin-service` | `8083` |
| `frontend-escuela` | `4200` |

Despliegue Rápido

```bash
git clone [https://github.com/48115220-sketch/sistema-gestion-escolar.git](https://github.com/48115220-sketch/sistema-gestion-escolar.git)
cd sistema-gestion-escolar
docker compose up --build