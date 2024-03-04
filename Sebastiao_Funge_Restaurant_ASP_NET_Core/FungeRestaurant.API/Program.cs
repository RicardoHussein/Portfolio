using Microsoft.AspNetCore.Authentication.Negotiate;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.DependencyInjection;
using FungeRestaurant.API.Data;
using FungeRestaurant.API.Repositories.Interface;
using FungeRestaurant.API.Repositories.Implementation;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddDbContext<FungeRestaurantAPIContext>(options =>
    options.UseSqlServer(builder.Configuration.GetConnectionString("FungeRestaurantAPIContext") ?? throw new InvalidOperationException("Connection string 'FungeRestaurantAPIContext' not found.")));

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

/**
builder.Services.AddAuthentication(NegotiateDefaults.AuthenticationScheme)
   .AddNegotiate();

builder.Services.AddAuthorization(options =>
{
    // By default, all incoming requests will be authorized according to the default policy.
    options.FallbackPolicy = options.DefaultPolicy;
});**/

builder.Services.AddScoped<IUserRepository, UserRepository>();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();

app.UseRouting();

app.UseCors(options =>
{
    options.AllowAnyHeader();
    options.AllowAnyOrigin();
    options.AllowAnyMethod();
});

//app.UseAuthentication();

//app.UseAuthorization();

app.MapControllers();

app.Run();
