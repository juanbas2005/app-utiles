.class public Li94;
.super Lr58;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final d:Ljo1;


# instance fields
.field public final b:Lcz6;

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljo1;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Ljo1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li94;->d:Ljo1;

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

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lr58;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcz6;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lcz6;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Li94;->b:Lcz6;

    .line 11
    .line 12
    iput-boolean v1, p0, Li94;->c:Z

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final d()V
    .locals 5

    .line 1
    iget-object p0, p0, Li94;->b:Lcz6;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcz6;->f()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Lcz6;->g(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Lh94;

    .line 16
    .line 17
    invoke-virtual {v3}, Lh94;->j()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget v0, p0, Lcz6;->z:I

    .line 24
    .line 25
    iget-object v2, p0, Lcz6;->y:[Ljava/lang/Object;

    .line 26
    .line 27
    move v3, v1

    .line 28
    :goto_1
    if-ge v3, v0, :cond_1

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    aput-object v4, v2, v3

    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iput v1, p0, Lcz6;->z:I

    .line 37
    .line 38
    iput-boolean v1, p0, Lcz6;->w:Z

    .line 39
    .line 40
    return-void
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
