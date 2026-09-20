.class public abstract Loh0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lez0;

.field public static final b:Lez0;

.field public static final c:Lez0;

.field public static final d:Lez0;

.field public static final e:Lez0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Le7;->B:Le7;

    .line 2
    .line 3
    sget v1, Lzg0;->a:I

    .line 4
    .line 5
    new-instance v1, Lez0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2, v0}, Lez0;-><init>(ILvr2;)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Loh0;->a:Lez0;

    .line 12
    .line 13
    sget-object v0, Le7;->C:Le7;

    .line 14
    .line 15
    new-instance v1, Lez0;

    .line 16
    .line 17
    invoke-direct {v1, v2, v0}, Lez0;-><init>(ILvr2;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Loh0;->b:Lez0;

    .line 21
    .line 22
    sget-object v0, Le7;->D:Le7;

    .line 23
    .line 24
    new-instance v1, Lez0;

    .line 25
    .line 26
    invoke-direct {v1, v2, v0}, Lez0;-><init>(ILvr2;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Loh0;->c:Lez0;

    .line 30
    .line 31
    sget-object v0, Le7;->E:Le7;

    .line 32
    .line 33
    new-instance v1, Lez0;

    .line 34
    .line 35
    invoke-direct {v1, v2, v0}, Lez0;-><init>(ILvr2;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Loh0;->d:Lez0;

    .line 39
    .line 40
    sget-object v0, Le7;->F:Le7;

    .line 41
    .line 42
    new-instance v1, Lez0;

    .line 43
    .line 44
    invoke-direct {v1, v2, v0}, Lez0;-><init>(ILvr2;)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Loh0;->e:Lez0;

    .line 48
    .line 49
    return-void
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

.method public static final a(Ljava/lang/Class;)Loq3;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Loh0;->a:Lez0;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lez0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast p0, Loq3;

    .line 14
    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
