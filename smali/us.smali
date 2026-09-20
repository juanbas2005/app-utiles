.class public final Lus;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:C

.field public final b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(CLjava/util/List;Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-char p1, p0, Lus;->a:C

    .line 5
    .line 6
    iput-object p3, p0, Lus;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 p1, 0x100

    .line 9
    .line 10
    new-array p2, p1, [Lus;

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    move v0, p3

    .line 14
    :goto_0
    if-ge v0, p1, :cond_4

    .line 15
    .line 16
    iget-object v1, p0, Lus;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    move v3, p3

    .line 24
    move-object v4, v2

    .line 25
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_2

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    move-object v6, v5

    .line 36
    check-cast v6, Lus;

    .line 37
    .line 38
    iget-char v6, v6, Lus;->a:C

    .line 39
    .line 40
    if-ne v6, v0, :cond_0

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const/4 v3, 0x1

    .line 46
    move-object v4, v5

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    if-nez v3, :cond_3

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    move-object v2, v4

    .line 52
    :goto_2
    aput-object v2, p2, v0

    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    return-void
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
