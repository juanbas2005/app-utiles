.class public final Ly16;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# static fields
.field public static final y:Ln63;


# instance fields
.field public final w:Lsr2;

.field public volatile x:Ljava/lang/ref/SoftReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln63;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Ln63;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ly16;->y:Ln63;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>(Ljava/lang/Object;Lsr2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Ly16;->x:Ljava/lang/ref/SoftReference;

    .line 8
    .line 9
    iput-object p2, p0, Ly16;->w:Lsr2;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance p2, Ljava/lang/ref/SoftReference;

    .line 14
    .line 15
    invoke-direct {p2, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Ly16;->x:Ljava/lang/ref/SoftReference;

    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    const-string p0, "Argument for @NotNull parameter \'initializer\' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null"

    .line 22
    .line 23
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Ly16;->y:Ln63;

    .line 2
    .line 3
    iget-object v1, p0, Ly16;->x:Ljava/lang/ref/SoftReference;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    return-object v1

    .line 18
    :cond_1
    iget-object v1, p0, Ly16;->w:Lsr2;

    .line 19
    .line 20
    invoke-interface {v1}, Lsr2;->b()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Ljava/lang/ref/SoftReference;

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move-object v0, v1

    .line 30
    :goto_0
    invoke-direct {v2, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Ly16;->x:Ljava/lang/ref/SoftReference;

    .line 34
    .line 35
    return-object v1
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
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
