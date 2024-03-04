using FungeRestaurant.API.Data;
using FungeRestaurant.API.Models;
using FungeRestaurant.API.Repositories.Interface;
using Microsoft.EntityFrameworkCore;

namespace FungeRestaurant.API.Repositories.Implementation
{
    public class UserRepository : IUserRepository
    {
        private readonly FungeRestaurantAPIContext dbContext;

        public UserRepository(FungeRestaurantAPIContext dbContext) 
        {
            this.dbContext = dbContext;
        }

        public async Task<User> CreateAsync(User user)
        {
            dbContext.User.Add(user);
            await dbContext.SaveChangesAsync();

            return user;
        }
    }
}
