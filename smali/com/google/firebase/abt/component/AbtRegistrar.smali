.class public Lcom/google/firebase/abt/component/AbtRegistrar;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-abt"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
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

.method public static synthetic a(Lkd6;)Lz3;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/abt/component/AbtRegistrar;->lambda$getComponents$0(Ltv0;)Lz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method private static synthetic lambda$getComponents$0(Ltv0;)Lz3;
    .locals 3

    .line 1
    new-instance v0, Lz3;

    .line 2
    .line 3
    const-class v1, Landroid/content/Context;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/content/Context;

    .line 10
    .line 11
    const-class v2, Lac;

    .line 12
    .line 13
    invoke-interface {p0, v2}, Ltv0;->h(Ljava/lang/Class;)Lnu5;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, v1, p0}, Lz3;-><init>(Landroid/content/Context;Lnu5;)V

    .line 18
    .line 19
    .line 20
    return-object v0
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


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgv0;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p0, Lz3;

    .line 2
    .line 3
    invoke-static {p0}, Lgv0;->b(Ljava/lang/Class;)Lfv0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "fire-abt"

    .line 8
    .line 9
    iput-object v0, p0, Lfv0;->a:Ljava/lang/String;

    .line 10
    .line 11
    const-class v1, Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v1}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0, v1}, Lfv0;->a(Lzp1;)V

    .line 18
    .line 19
    .line 20
    const-class v1, Lac;

    .line 21
    .line 22
    invoke-static {v1}, Lzp1;->a(Ljava/lang/Class;)Lzp1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p0, v1}, Lfv0;->a(Lzp1;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lh;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v1, v2}, Lh;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lfv0;->g:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {p0}, Lfv0;->b()Lgv0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v1, "21.1.1"

    .line 42
    .line 43
    invoke-static {v0, v1}, Lgw8;->q(Ljava/lang/String;Ljava/lang/String;)Lgv0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    filled-new-array {p0, v0}, [Lgv0;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method
