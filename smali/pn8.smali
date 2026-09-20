.class public abstract Lpn8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lq79;

.field public static volatile b:Ljava/lang/String;

.field public static final c:Lrg4;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lon8;->x:Lon8;

    .line 2
    .line 3
    sget v1, Ls93;->y:I

    .line 4
    .line 5
    sget-object v1, Lo36;->F:Lo36;

    .line 6
    .line 7
    new-instance v2, Luw2;

    .line 8
    .line 9
    new-instance v3, Lb89;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    invoke-direct {v3, v0, v4, v1}, Lb89;-><init>(Los2;ZLs93;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v3, v2, Luw2;->b:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v0, Lrg4;

    .line 21
    .line 22
    const/16 v1, 0x19

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lrg4;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lpn8;->c:Lrg4;

    .line 28
    .line 29
    new-instance v0, Lq79;

    .line 30
    .line 31
    const-string v1, "__phenotype_server_token"

    .line 32
    .line 33
    const-string v3, ""

    .line 34
    .line 35
    invoke-direct {v0, v1, v2, v3}, Lq79;-><init>(Ljava/lang/String;Luw2;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lpn8;->a:Lq79;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    sput-object v0, Lpn8;->b:Ljava/lang/String;

    .line 42
    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lpn8;->a:Lq79;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt79;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
