using Microsoft.EntityFrameworkCore;

namespace OrderConsult.DataAccess 
{
    public class ApplicationDdContext: DbContext {
        public ApplicationDdContext(){

        }
        public ApplicationDdContext(DbContextOptions<ApplicationDdContext> options) : base(options) {
        }

        // protected override void OnConfiguring(DbContextOptionsBuilder dbContextOptionsBuilder)
        // {
        //     if (!dbContextOptionsBuilder.IsConfigured)
        //     {
        //         dbContextOptionsBuilder.UseSqlServer( Configura Database.DatabaseConnection.ConnectionConfiguration.GetConnectionString("DefaultConnection"));
        //     }
        // }

        public DbSet<OsStatus> OsStatus { get; set; }

    }
}