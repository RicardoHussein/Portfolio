using FungeRestaurant.API.Data;
using FungeRestaurant.API.Models;
using FungeRestaurant.API.Repositories.Interface;

namespace FungeRestaurant.API.Repositories.Implementation
{
    public class SalespersonRepository : ISalespersonRepository
    {
        private readonly FungeRestaurantAPIContext dbContext;

        public SalespersonRepository(FungeRestaurantAPIContext dbContext)
        {
            this.dbContext = dbContext;
        }

        public async Task<Salesperson> CreateAsync(Salesperson salesperson)
        {
            dbContext.Salesperson.Add(salesperson);
            await dbContext.SaveChangesAsync();

            return salesperson;
        }
    }
}
