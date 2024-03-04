using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using FungeRestaurant.API.Models;

namespace FungeRestaurant.API.Data
{
    public class FungeRestaurantAPIContext : DbContext
    {
        public FungeRestaurantAPIContext (DbContextOptions<FungeRestaurantAPIContext> options)
            : base(options)
        {
        }

        public DbSet<FungeRestaurant.API.Models.Customer> Customer { get; set; } = default!;
        public DbSet<FungeRestaurant.API.Models.Product> Product { get; set; } = default!;
        public DbSet<FungeRestaurant.API.Models.Restaurant> Restaurant { get; set; } = default!;
        public DbSet<FungeRestaurant.API.Models.Salesperson> Salesperson { get; set; } = default!;
        public DbSet<FungeRestaurant.API.Models.User> User { get; set; } = default!;
    }
}
