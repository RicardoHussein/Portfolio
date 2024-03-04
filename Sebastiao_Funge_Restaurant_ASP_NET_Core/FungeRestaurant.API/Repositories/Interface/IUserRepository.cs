using FungeRestaurant.API.Models;

namespace FungeRestaurant.API.Repositories.Interface
{
    public interface IUserRepository
    {
        Task<User> CreateAsync(User user);
    }
}
