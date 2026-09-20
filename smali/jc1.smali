.class public final Ljc1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Llm7;


# instance fields
.field public final a:Lrt;

.field public final b:Lt83;

.field public final c:I


# direct methods
.method public constructor <init>(Lrt;Lt83;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljc1;->a:Lrt;

    .line 5
    .line 6
    iput-object p2, p0, Ljc1;->b:Lt83;

    .line 7
    .line 8
    iput p3, p0, Ljc1;->c:I

    .line 9
    .line 10
    if-lez p3, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "durationMillis must be > 0."

    .line 14
    .line 15
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    new-instance v0, Lgc1;

    .line 2
    .line 3
    iget-object v1, p0, Ljc1;->a:Lrt;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ljc1;->b:Lt83;

    .line 9
    .line 10
    invoke-virtual {v1}, Lt83;->a()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1}, Lt83;->b()Ls83;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget-object v3, v3, Ls83;->x:Lwf6;

    .line 19
    .line 20
    instance-of v4, v1, Lf77;

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    move-object v5, v1

    .line 25
    check-cast v5, Lf77;

    .line 26
    .line 27
    iget-boolean v5, v5, Lf77;->g:Z

    .line 28
    .line 29
    if-nez v5, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v5, 0x0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    const/4 v5, 0x1

    .line 35
    :goto_1
    iget p0, p0, Ljc1;->c:I

    .line 36
    .line 37
    invoke-direct {v0, v2, v3, p0, v5}, Lgc1;-><init>(Landroid/graphics/drawable/Drawable;Lwf6;IZ)V

    .line 38
    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    instance-of p0, v1, Ls62;

    .line 44
    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    :goto_2
    return-void

    .line 48
    :cond_3
    invoke-static {}, Lh;->c()V

    .line 49
    .line 50
    .line 51
    return-void
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
