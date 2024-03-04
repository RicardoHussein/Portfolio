using System.ComponentModel.DataAnnotations.Schema;

namespace FungeRestaurant.API.Models
{
    [Table("SEBASTIAO_RESTAURANT_ProductViewModels")]
    public class ProductViewModel
    {
        public int? ProductID { get; set; }

        //[Required]
        public virtual Product product { get; set; }

        public IFormFile? Photo { get; set; }
    }
}
