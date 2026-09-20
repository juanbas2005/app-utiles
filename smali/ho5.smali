.class public final Lho5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lio5;Lvu6;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lho5;->w:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lho5;->y:Ljava/lang/Object;

    iput-object p2, p0, Lho5;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lro8;Lno7;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lho5;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lho5;->x:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lho5;->y:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
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
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget v0, p0, Lho5;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Lho5;->y:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lho5;->x:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lbq8;

    .line 11
    .line 12
    instance-of v0, p1, Lqq8;

    .line 13
    .line 14
    check-cast p2, Lbq8;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    instance-of p0, p2, Lqq8;

    .line 21
    .line 22
    if-nez p0, :cond_3

    .line 23
    .line 24
    move v2, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    instance-of v0, p2, Lqq8;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const/4 v2, -0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    check-cast p0, Lro8;

    .line 33
    .line 34
    if-nez p0, :cond_2

    .line 35
    .line 36
    invoke-interface {p1}, Lbq8;->g()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {p2}, Lbq8;->g()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    check-cast v1, Lno7;

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    new-array v0, v0, [Lbq8;

    .line 53
    .line 54
    aput-object p1, v0, v2

    .line 55
    .line 56
    aput-object p2, v0, v3

    .line 57
    .line 58
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p0, v1, p1}, Lro8;->a(Lno7;Ljava/util/List;)Lbq8;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-interface {p0}, Lbq8;->p()Ljava/lang/Double;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 71
    .line 72
    .line 73
    move-result-wide p0

    .line 74
    invoke-static {p0, p1}, Lya5;->E(D)D

    .line 75
    .line 76
    .line 77
    move-result-wide p0

    .line 78
    double-to-int v2, p0

    .line 79
    :cond_3
    :goto_0
    return v2

    .line 80
    :pswitch_0
    check-cast p1, Lvu6;

    .line 81
    .line 82
    check-cast p2, Lvu6;

    .line 83
    .line 84
    check-cast v1, Lio5;

    .line 85
    .line 86
    check-cast p0, Lvu6;

    .line 87
    .line 88
    invoke-virtual {v1, p1, p0}, Lio5;->a(Lvu6;Lvu6;)F

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    invoke-virtual {v1, p2, p0}, Lio5;->a(Lvu6;Lvu6;)F

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    return p0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method
