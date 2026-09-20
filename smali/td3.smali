.class public abstract Ltd3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lds0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Luh3;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v2, 0x1a

    .line 11
    .line 12
    if-lt v0, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    move v0, v1

    .line 18
    :goto_1
    if-eqz v0, :cond_2

    .line 19
    .line 20
    new-instance v0, Lz53;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lz53;-><init>(I)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    new-instance v0, Ln63;

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ln63;-><init>(I)V

    .line 29
    .line 30
    .line 31
    :goto_2
    sput-object v0, Ltd3;->a:Lds0;

    .line 32
    .line 33
    return-void
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
.end method
