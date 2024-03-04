using FungeRestaurant.API.Models;

namespace FungeRestaurant.API.Repositories.Interface
{
    public interface ISalespersonRepository
    {
        Task<Salesperson> CreateAsync(Salesperson salesperson);
    }
}
